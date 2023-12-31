USE [QuanLyQuayThuoc]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 11/4/2023 2:19:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[HoaDonHoaDonID] [int] NOT NULL,
	[SanPhamID] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[DonGia] [real] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[HoaDonHoaDonID] ASC,
	[SanPhamID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HangNhap]    Script Date: 11/4/2023 2:19:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HangNhap](
	[NhaCungCapID] [int] IDENTITY(1,1) NOT NULL,
	[SanPhamID] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[NgayNhap] [datetime] NULL,
	[GiaTriDon] [real] NOT NULL,
	[TrangThaiDonNhap] [varchar](255) NULL,
	[TrangThaiThanhToan] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[NhaCungCapID] ASC,
	[SanPhamID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/4/2023 2:19:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[HoaDonID] [int] IDENTITY(1,1) NOT NULL,
	[KhachHangID] [int] NOT NULL,
	[NhapVienID] [int] NOT NULL,
	[NgayLapHoaDon] [datetime] NULL,
	[TongTien] [real] NOT NULL,
	[TienThua] [real] NOT NULL,
	[TienNhan] [real] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[HoaDonID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/4/2023 2:19:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[KhachHangID] [int] IDENTITY(1,1) NOT NULL,
	[HoTen] [varchar](255) NULL,
	[SoDienThoai] [varchar](255) NULL,
	[NgaySinh] [datetime] NULL,
	[GioiTinh] [bit] NOT NULL,
	[Email] [varchar](255) NULL,
	[DiaChi] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[KhachHangID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 11/4/2023 2:19:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[NhaCungCapID] [int] IDENTITY(1,1) NOT NULL,
	[TenNhaCungCap] [varchar](255) NULL,
	[SoDienThoai] [varchar](255) NULL,
	[DiaChi] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[NhaCungCapID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/4/2023 2:19:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[NhanVienID] [int] IDENTITY(1,1) NOT NULL,
	[HoTen] [varchar](255) NULL,
	[GioiTinh] [varchar](255) NULL,
	[SoDIenThoai] [varchar](255) NULL,
	[ChucVu] [varchar](255) NULL,
	[NgaySinh] [datetime] NULL,
	[DiaChi] [varchar](255) NULL,
	[UserName] [varchar](255) NULL,
	[Password] [varchar](255) NULL,
	[Email] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[NhanVienID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/4/2023 2:19:00 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[SanPhamID] [int] IDENTITY(1,1) NOT NULL,
	[TenSanPham] [varchar](255) NULL,
	[DonGia] [real] NOT NULL,
	[TinhTrang] [varchar](255) NULL,
	[LoSanXuat] [varchar](255) NULL,
	[LoaiSanPham] [varchar](255) NULL,
	[ThanhPhan] [varchar](255) NULL,
	[XuatXu] [varchar](255) NULL,
	[HanSuDung] [datetime] NULL,
	[ImgPath] [varchar](255) NULL,
	[NgaySanXuat] [datetime] NULL,
	[SoLuongTon] [int] NOT NULL,
	[GiaBan] [real] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[SanPhamID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [SoDIenThoai], [ChucVu], [NgaySinh], [DiaChi], [UserName], [Password], [Email]) VALUES (2, N'Nguyen Le Nhat Huy', N'Nam', N'0384784472', N'Nhan_Vien', CAST(N'2003-09-20T00:00:00.000' AS DateTime), N'Tây Ninh', N'21128101', N'123', N'nhathuy39337343@gmail.com')
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [SoDIenThoai], [ChucVu], [NgaySinh], [DiaChi], [UserName], [Password], [Email]) VALUES (3, N'Tran Gia Huy', N'Nam', N'', N'Nhan_Vien', CAST(N'2023-10-31T00:00:00.000' AS DateTime), N'Long An', N'21121781', N'123', N'')
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [SoDIenThoai], [ChucVu], [NgaySinh], [DiaChi], [UserName], [Password], [Email]) VALUES (4, N'Nguyen Huy Hoang', N'Nam', N'', N'Nhan_Vien', CAST(N'2023-11-01T00:00:00.000' AS DateTime), N'', N'21084321', N'123', N'')
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
GO
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([SanPhamID], [TenSanPham], [DonGia], [TinhTrang], [LoSanXuat], [LoaiSanPham], [ThanhPhan], [XuatXu], [HanSuDung], [ImgPath], [NgaySanXuat], [SoLuongTon], [GiaBan]) VALUES (2, N'ABC', 2000, N'', N'', N'', N'', N'', CAST(N'2023-11-01T00:00:00.000' AS DateTime), N'', CAST(N'2023-11-01T00:00:00.000' AS DateTime), 0, 0)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FKChiTietHoa549264] FOREIGN KEY([HoaDonHoaDonID])
REFERENCES [dbo].[HoaDon] ([HoaDonID])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FKChiTietHoa549264]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FKChiTietHoa733233] FOREIGN KEY([SanPhamID])
REFERENCES [dbo].[SanPham] ([SanPhamID])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FKChiTietHoa733233]
GO
ALTER TABLE [dbo].[HangNhap]  WITH CHECK ADD  CONSTRAINT [FKHangNhap211894] FOREIGN KEY([SanPhamID])
REFERENCES [dbo].[SanPham] ([SanPhamID])
GO
ALTER TABLE [dbo].[HangNhap] CHECK CONSTRAINT [FKHangNhap211894]
GO
ALTER TABLE [dbo].[HangNhap]  WITH CHECK ADD  CONSTRAINT [FKHangNhap721774] FOREIGN KEY([NhaCungCapID])
REFERENCES [dbo].[NhaCungCap] ([NhaCungCapID])
GO
ALTER TABLE [dbo].[HangNhap] CHECK CONSTRAINT [FKHangNhap721774]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon506668] FOREIGN KEY([KhachHangID])
REFERENCES [dbo].[KhachHang] ([KhachHangID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon506668]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon768003] FOREIGN KEY([NhapVienID])
REFERENCES [dbo].[NhanVien] ([NhanVienID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon768003]
GO
